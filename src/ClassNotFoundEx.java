
public class ClassNotFoundEx {
		public static void main(String[] args) {
			
				try {
					Class.forName("one");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}
