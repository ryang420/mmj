package com.epam.mmj.user.resources;

import com.epam.mmj.user.domain.config.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PropertyController {
    protected static final Logger logger = Logger.getLogger(PropertyController.class.getName());

    @Autowired
    UserProperties userProperties;

    @RequestMapping("/show")
    public ResponseEntity<UserProperties> show() {
        logger.info("calling property show API.");
        return new ResponseEntity<>(userProperties, HttpStatus.OK);
    }
}
