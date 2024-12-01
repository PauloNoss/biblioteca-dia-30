public class livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    public livro(String titulo, String autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Gênero: %s | Disponível: %s",
                titulo, autor, genero, disponivel ? "Sim" : "Não");
    }
}