package ejerciciovideojuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideoJuego {

    public static void main (String[]args){

        List<VideoJuego> listaVideojuegos= new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego(123, "Smash Bros. Ultimate", "Nintendo Switch", 8, "Fighting");
        VideoJuego video2 = new VideoJuego(456, "Call of Duty", "Multiplataforma", 64, "FPS");
        VideoJuego video3 = new VideoJuego(564, "League of legends", "PC", 10, "Moba" );
        VideoJuego video4 = new VideoJuego(421, "Mario Kart", "Nintendo Switch", 12, "Carreras");
        VideoJuego video5 = new VideoJuego(214, "Rainbow SiX Siege", "Multiplataforma", 10, "FPS");

        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);

        for (VideoJuego video : listaVideojuegos){
            System.out.println("Titulo " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cantidad de jugadores: " + video.getCantJugadores());


        }
        //Cambio de nombre y jugadores
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);

        video4.setTitulo("Mario Kart 8");
        video4.setCantJugadores(16);

        //Mostrar por pantalla juegos que sean ed consola Nintendo Switch


        for (VideoJuego video : listaVideojuegos){

            if (video.getConsola().equals("Nintendo Switch")){
                System.out.println(video.toString());
            }

        }

        }
    }
