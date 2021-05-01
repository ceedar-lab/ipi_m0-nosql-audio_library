package com.ipi.web;

import com.ipi.web.model.Album;
import com.ipi.web.repository.AlbumRepository;
import com.ipi.web.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ClientRepository clientRepository;

    public static void print(Object t) {
        System.out.println(t);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Album> albums = albumRepository.findAllByTitreIsNotNull();
        print(albums);
    }
}
