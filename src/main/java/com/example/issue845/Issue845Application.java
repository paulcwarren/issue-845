package com.example.issue845;

import java.io.ByteArrayInputStream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.content.commons.property.PropertyPath;

@SpringBootApplication
public class Issue845Application  implements ApplicationRunner {

    private static Logger LOG = LoggerFactory.getLogger(Issue845Application.class);

    @Autowired
    private DriverDocumentRepository repo;

    @Autowired
    private DriverDocumentContentStore store;

    @Autowired
    private MaintenanceEvidenceContentStore store2;

    public static void main(String[] args) {
        SpringApplication.run(Issue845Application.class, args);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void run(ApplicationArguments args) throws Exception {

        DriverDocument f = new DriverDocument();
        f = store.setContent(f, PropertyPath.from("content"), new ByteArrayInputStream("foo".getBytes()));
        f = repo.save(f);

        LOG.info(IOUtils.toString(store.getContent(f, PropertyPath.from("content"))));

        store2.getContent(new MaintenanceEvidence(), PropertyPath.from("content"));
    }
}
