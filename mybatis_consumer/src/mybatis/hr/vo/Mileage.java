package mybatis.hr.vo;

public class Mileage {
	private int minMile;
	private int maxMile;
	public Mileage(){}
	public Mileage(int minMile, int maxMile) {
		super();
		this.minMile = minMile;
		this.maxMile = maxMile;
	}
	public int getMinMile() {
		return minMile;
	}
	public void setMinMile(int minMile) {
		this.minMile = minMile;
	}
	public int getMaxMile() {
		return maxMile;
	}
	public void setMaxMile(int maxMile) {
		this.maxMile = maxMile;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxMile;
		result = prime * result + minMile;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mileage other = (Mileage) obj;
		if (maxMile != other.maxMile)
			return false;
		if (minMile != other.minMile)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mileage [minMile=" + minMile + ", maxMile=" + maxMile + "]";
	}
	
}
