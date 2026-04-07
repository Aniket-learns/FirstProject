public class Addition {
   
        public void sum(int a, int b) {
            System.out.println(a + b);
        }
        public void sum(double a, double b) {
            System.out.println(a + b);
        }
        public void sum(int a, double b) {
            System.out.println(a + b);
        }
        public void sum(double a, int b) {
            System.out.println(a + b);
        }
        public static void main(String[] args) {
            Addition d = new Addition();
            d.sum(2,5);
            d.sum(2.5, 3.5);
            d.sum(2, 4.5);
            d.sum(2.5, 6);;
        }
}