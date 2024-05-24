package Exercicio7e8.demo.src.main.java.com.example.demo;

public class TransacaoDTO {
    @NotBlank(message = "O recebedor não pode estar em branco.")
    private String recebedor;

    @NotBlank(message = "O pagador não pode estar em branco.")
    private String pagador;

    @Min(value = 0, message = "A quantidade deve ser maior que 0.")
    private Double quantidade;

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}