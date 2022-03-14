package logica;

public class Pc {

	private int id;
	private String pc;
	private String ip;

	public Pc() {
	}

	public Pc(String pc, String ip) {

		this.pc = pc;
		this.ip = ip;
	}

	public Pc(int id, String pc, String ip) {

		this.id = id;
		this.pc = pc;
		this.ip = ip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Pc [id=" + id + ", pc=" + pc + ", ip=" + ip + "]";
	}

}
