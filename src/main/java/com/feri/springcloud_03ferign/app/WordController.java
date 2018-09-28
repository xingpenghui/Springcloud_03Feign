package com.feri.springcloud_03ferign.app;

import com.feri.springcloud_03ferign.pojo.Word;
import com.feri.springcloud_03ferign.service.WordService;
import com.feri.springcloud_03ferign.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 12:04
 */
@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping("wordadd.do")
    public R add(Word word){
        return wordService.save(word);
    }
    @GetMapping("wordall.do")
    public List<Word> list(@RequestParam int flag){
        return wordService.list(flag);
    }
}
