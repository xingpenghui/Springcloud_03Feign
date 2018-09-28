package com.feri.springcloud_03ferign.service;

import com.feri.springcloud_03ferign.pojo.Word;
import com.feri.springcloud_03ferign.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 12:00
 */
@FeignClient(value = "provider1803")
public interface WordService {
    @RequestMapping(value = "/wordsave.do",method = RequestMethod.POST)
    public R save(@RequestBody Word word);
    @RequestMapping(value = "/wordlist.do",method = RequestMethod.GET)
    public List<Word> list(@RequestParam(value = "flag") int flag);
}
