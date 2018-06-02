
public class Score{
	int total;
	public void setTotal(int total) throws OddNumberException{
		
		if(total%2==1) {
			throw new OddNumberException();
		}
		this.total = total;

	}
	public void showTotal() {
		System.out.println("총점은"+total);
	}
}
