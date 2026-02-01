public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula= 8.2;
        String plan = "plus";

        if(fechaDeLanzamiento > 2022){
            System.out.println("Películas más popúlares");
        }else {
            System.out.println("Películas retro que aún vale la pena ver");
        }

        if(incluidoEnElPlan && plan.equals("plus")){
            System.out.println("Disfrute de su película");
        }else {
            System.out.println("Película no disponible para su plan actual");
        }
    }
}
