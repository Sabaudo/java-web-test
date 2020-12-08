package model;

public class JavaBeans {
	
	private int id; //numero_pedido
	private String cliente;
	private String data;
	private String cpf;
	private String email;
	private String nome_pedido;
	private int quantidade_itens;
	private float valor_pedido;
	
	
	public JavaBeans() {
		super();
		
	}
	
	
	public JavaBeans(int id, String cliente, String data, String cpf, String email, String nome_pedido,
			int quantidade_itens, float valor_pedido) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.data = data;
		this.cpf = cpf;
		this.email = email;
		this.nome_pedido = nome_pedido;
		this.quantidade_itens = quantidade_itens;
		this.valor_pedido = valor_pedido;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome_pedido() {
		return nome_pedido;
	}
	public void setNome_pedido(String nome_pedido) {
		this.nome_pedido = nome_pedido;
	}
	public int getQuantidade_itens() {
		return quantidade_itens;
	}
	public void setQuantidade_itens(int quantidade_itens) {
		this.quantidade_itens = quantidade_itens;
	}
	public float getValor_pedido() {
		return valor_pedido;
	}
	public void setValor_pedido(float valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
}
