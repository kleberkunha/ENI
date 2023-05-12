package k.eni.tp3;

public class EniTP3 {
	private int attribute;
	private int attribute1;

	/**
	 * @param attribute
	 */
	public EniTP3(int attribute, int attribute1) {
		this.attribute = attribute;
		this.attribute1 = attribute1;
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public int getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}
}
