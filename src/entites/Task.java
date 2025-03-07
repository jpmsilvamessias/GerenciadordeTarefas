package entites;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {

    private Integer id;
    private String titulo;
    private String descrição;
    private LocalDateTime dataVencimento;
    private  boolean status;

    public Task(Integer id, String titulo, String descrição, LocalDateTime dataVencimento, boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.descrição = descrição;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Título: " + titulo +
                " | Descrição: " + descrição +
                " | Data de Vencimento: " + dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                " | Status: " + (status ? "Concluída" : "Pendente");
    }

}
