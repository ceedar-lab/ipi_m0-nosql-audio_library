package com.ipi.web.controller;

import com.ipi.web.model.Album;
import com.ipi.web.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @ResponseBody
    @GetMapping("/test")
    public String home() {
        String html = "";
        html += "<div>";
        html += " <p>Test OK</p>";
        html += "</div>";
        return html;
    }

    @ResponseBody
    @GetMapping(value = "/albums", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Album> getAllAlbums() {
        return albumRepository.findAllByTitreIsNotNull();
    }
}
