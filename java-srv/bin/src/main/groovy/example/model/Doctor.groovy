package example.model;

import lombok.*;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node
public class Doctor {
    @Id
    private Long id;
    private String name;
    private String department;
    private String specialty;
}
