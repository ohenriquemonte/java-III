
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111,1111);
		
		cc.deposita(100);
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC SALDO: " + cc.getSaldo());
		System.out.println("CP SALDO: " + cp.getSaldo());
	}
}