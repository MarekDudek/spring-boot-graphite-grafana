package md.springbootgraphitegrafana.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person getPerson(String id) {
        Person person = personRepository.getPersonById(id);
        if (Objects.nonNull(person)) {
            double salary = 5000.00;
            person.setSalary(salary);
        }
        return person;
    }
}