package com.example.springCore.repos;

//import com.example.springCore.RequestDto;
import com.example.springCore.domain.Message;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MessageRepo extends CrudRepository <Message, Long> {
//позволяет получить либо полный список полей, либо по иентификатору
    List<Message> findByTag(String tag);


}
