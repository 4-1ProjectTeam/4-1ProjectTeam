package awsreactspring.jong.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diary {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    

    
}
