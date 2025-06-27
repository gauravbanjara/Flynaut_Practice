class  Example extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Example.sleep(500);
                System.out.println("Panther");
                System.out.println(currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
        public static void main(String[] args) {
            Example e1 = new Example();
            Example e2  = new Example();
            e1.start();
            e2.start();
        }
}
