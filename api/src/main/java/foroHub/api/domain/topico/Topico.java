package foroHub.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    @Enumerated(EnumType.STRING)
    private StatusTopico status;

    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }


}
