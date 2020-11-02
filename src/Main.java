public class Main {
    public static void main(String[] args) {


        int suurus = 10;

        for(int rowIndex = 0; rowIndex < suurus; rowIndex++) {

            for(int columnIndex = 0; columnIndex < suurus; columnIndex++) {

                //Kui reaindeks on suurem kui veeruindeks
                if(rowIndex > columnIndex) {
                    System.out.print(suurus - 1 - rowIndex + " ");

                    // Kui reaindeks on väiksem/võrdne kui veeruindeks
                } else {
                    System.out.print(suurus - 1 - columnIndex + " ");
                }

            }
            //reavahetus, liigub järgmisele reale
            System.out.println();
        }

    }

}