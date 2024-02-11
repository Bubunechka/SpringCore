package com.example.springCore.repos;

import com.example.springCore.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository <Message, Long> {
//позволяет получить либо полный список полей, либо по иентификатору


}
