
public class EditorVideo extends Funcionario {
	public double getBonificacao() {
		System.out.println("metodo bonificacao ev");
		return super.getBonificacao() + 100;
	}
}
