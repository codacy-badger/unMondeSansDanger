import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Story {
    public static int storyPhase = 0;
    public static String[] phasesDone;
    public static String phaseKey = "0";

    public static void openStoryFrame(String language) {

        // Frame declaration
        JFrame frame = new JFrame("Conversational Game | DHR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Create a custom JPanel for the gradient background
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = Color.LIGHT_GRAY;
                Color color2 = getBackground();
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fill(new Rectangle2D.Double(0, 0, width, height));
            }
        };

        // Set the gradient panel as the content pane of the frame
        frame.setContentPane(gradientPanel);

        // Location + Body + Panel
        JLabel Location = new JLabel(getLocationText(phaseKey), SwingConstants.LEFT);
        System.out.println(phaseKey);
        Location.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Location.setBorder(new EmptyBorder(35, 20, 0, 20));

        JLabel Body = new JLabel(getMainOutput(phaseKey), SwingConstants.LEFT);
        Body.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        Body.setBorder(new EmptyBorder(0, 20, 150, 20));

        JPanel Panel = new JPanel();
        JButton O1 = new JButton(getOption1(phaseKey));
        JButton O2 = new JButton(getOption2(phaseKey));

        O1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (phaseKey) {
                    case "0":
                        O1.setText(getOption1("1A"));
                        Body.setText(getMainOutput("1A"));
                        O2.setText(getOption2("1A"));
                        Location.setText(getLocationText("1A"));
                        phaseKey = "1A";
                        break;
                    case "1A":
                        O1.setText(getOption1("2A"));
                        Body.setText(getMainOutput("2A"));
                        O2.setText(getOption2("2A"));
                        Location.setText(getLocationText("2A"));
                        phaseKey = "2A";
                        break;
                    case "1B":
                        O1.setText(getOption1("2C"));
                        Body.setText(getMainOutput("2C"));
                        O2.setText(getOption2("2C"));
                        Location.setText(getLocationText("2C"));
                        phaseKey = "2C";
                        break;
                    case "2A":
                        O1.setText(getOption1("3A"));
                        Body.setText(getMainOutput("3A"));
                        O2.setText(getOption2("3A"));
                        Location.setText(getLocationText("3A"));
                        phaseKey = "3A";
                        break;
                    case "3A":
                        O1.setText(getOption1("4A"));
                        Body.setText(getMainOutput("4A"));
                        O2.setText(getOption2("4A"));
                        Location.setText(getLocationText("4A"));
                        phaseKey = "4A";
                        break;
                    case "3B":
                        O1.setText(getOption1("4B"));
                        Body.setText(getMainOutput("4B"));
                        O2.setText(getOption2("4B"));
                        Location.setText(getLocationText("4B"));
                        phaseKey = "4B";
                        break;
                    case "4A":
                        O1.setText(getOption1("5A"));
                        Body.setText(getMainOutput("5A"));
                        O2.setText(getOption2("5A"));
                        Location.setText(getLocationText("5A"));
                        phaseKey = "5A";
                        break;
                    case "2B":
                        O1.setText(getOption1("3C"));
                        Body.setText(getMainOutput("3C"));
                        O2.setText(getOption2("3C"));
                        Location.setText(getLocationText("3C"));
                        phaseKey = "3C";
                        break;
                    case "3C":
                        O1.setText(getOption1("4D"));
                        Body.setText(getMainOutput("4D"));
                        O2.setText(getOption2("4D"));
                        Location.setText(getLocationText("4D"));
                        phaseKey = "4D";
                        break;
                    default:
                        break;
                }
            }
        });

        O2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        Panel.add(O1);
        Panel.add(O2);

        gradientPanel.setLayout(new BorderLayout());
        gradientPanel.add(Panel, BorderLayout.SOUTH);
        gradientPanel.add(Location, BorderLayout.NORTH);
        gradientPanel.add(Body, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static String getLocationText(String phaseKey) {
        if (phaseKey == "3D"|| phaseKey == "4B" || phaseKey == "4E" || phaseKey == "5B" || phaseKey == "5F" || phaseKey == "3F" || phaseKey == "5J" || phaseKey == "5M" || phaseKey == "4H") {
            return gameOverFrame("Spanish");
        } else {
            switch (phaseKey) {
                case "0":
                    return "Boulogne-Billancourt, Francia";
                case "1A":
                    return "Fábrica abandonada, Isla Seguin";
                case "1B":
                    return "Academia Kádic";
                case "2A":
                    return "Fábrica abandonada, Isla Seguin";
                case "2B":
                    return "Academia Kádic";
                case "2C":
                    return "Academia Kádic";
                case "2D":
                    return "Fábrica abandonada, Isla Seguin";
                case "3A":
                    return "Piso -1, Fábrica abandonada";
                case "3B":
                    return "Piso -2, Fábrica abandonada";
                case "3C":
                    return "Bosque Kádic";
                case "3D":
                    return "getLocationText() failed to assign the phase. This phase is a GAME OVER.";
                case "3E":
                    return "Boulogne-Billancourt, Francia";
                case "3F":
                    return "Boulogne-Billancourt, Francia";
                case "3H":
                    return "Boulogne-Billancourt, Francia";
                case "4A":
                    return "Boulogne-Billancourt, Francia";
                case "4B":
                    return "Boulogne-Billancourt, Francia";
                case "4C":
                    return "Boulogne-Billancourt, Francia";
                case "4D":
                    return "Boulogne-Billancourt, Francia";
                case "4E":
                    return "Boulogne-Billancourt, Francia";
                case "4F":
                    return "Boulogne-Billancourt, Francia";
                case "4G":
                    return "Boulogne-Billancourt, Francia";
                case "4H":
                    return "Boulogne-Billancourt, Francia";
                case "5A":
                    return "Boulogne-Billancourt, Francia";
                case "5B":
                    return "Boulogne-Billancourt, Francia";
                default:
                    return "LocationText failed.";
        }
        }
    }

    private static String getOption1(String phaseKey) {
        switch (phaseKey) {
            case "0":
                return "<HTML>Pasas el puente y entras.</HTML>";
            case "1A":
                return "<HTML>Te acercas al ascensor a investigarlo.</HTML>";
            case "1B":
                return "<HTML>Sigues visitando el sitio web en busca de más archivos de vídeo.</HTML>";
            case "2A":
                return "<HTML>Buscas la manera de encenderlo.</HTML>";
            case "2B":
                return "<HTML>Le crees y vas al bosque a verlas.</HTML>";
            case "2C":
                return "<HTML>Buscar a tus amigos Ulrich, Yumi y Odd para hacerles ver el archivo de vídeos.</HTML>";
            case "2D":
                return "<HTML>Continuar.</HTML>";
            case "3A":
                return "<HTML>Encender el interruptor.</HTML>";
            case "3B":
                return "<HTML>Encender el interruptor.</HTML>";
            case "3C":
                return "<HTML>Visitar el Piso -1.</HTML>";
            case "3D":
                return "<HTML>Volver al menú.</HTML>";
            case "3E":
                return "<HTML>XXXXX</HTML>";
            case "3F":
                return "<HTML>Volver al menú.</HTML>";
            case "3H":
                return "<HTML>Continuar.</HTML>";
            case "4A":
                return "<HTML>Volver al menú.</HTML>";
            default:
                return "<HTML>Option.</HTML>";
        }
    }
    
    private static String getOption2(String phaseKey) {
        switch (phaseKey) {
            case "0":
                return "<HTML>Lo ignoras y vuelves a casa.</HTML>";
            case "1A":
                return "<HTML>Decides salir de la fábrica.";
            case "1B":
                return "<HTML>Vas directamente a la fábrica en búsqueda de la sala de los vídeos.</HTML>";
            case "2A":
                return "<HTML>Visitas la sala y vas a otro piso.</HTML>";
            case "2B":
                return "<HTML>Le ignoras y le dices que es normal.</HTML>";
            case "2C":
                return "<HTML>Ir a la fábrica en búsqueda de respuestas.</HTML>";
            case "3A":
                return "<HTML>Decides andar encima del círculo que hay dibujado en el suelo.</HTML>";
            case "3B":
                return "<HTML>Decides andar encima del círculo que hay dibujado en el suelo.</HTML>";
            case "3C":
                return "<HTML>Visitar el Piso -2</HTML>";
            case "3D":
                return "<HTML>Cerrar el juego.</HTML>";
            case "3E":
                return "<HTML>XXXXX</HTML>";
            case "3F":
                return "<HTML>Cerrar el juego.</HTML>";
            case "4A":
                return "<HTML>No hacer nada</HTML>";
            case "4B":
                return "<HTML>Cerrar el juego.";
            default:
                return "LocationText failed.";
        }
    }

    private static String getMainOutput(String phaseKey) {
        switch (phaseKey) {
            case "0":
                return "<HTML>Acabas de salir de la Academia Kádic y vas de camino a casa pero hoy decides ir a pasear por el bosque y cruzar a ver esa fábrica en la Isla Seguine. El puente aunque esté un poco dañado aún se puede transitar. Parece que uno de los portones de la fábrica abandonada está casi abierta. ¿Qué harás?</HTML>";
            case "1A":
                return "<HTML>Decides cruzar el puente hacia la Isla Seguine y te acercas a la fábrica abandonada. La puerta está entreabierta, y una sensación de intriga te impulsa a entrar. El interior de la fábrica está casi vacío y sólo hay un ascensor con pinta de estar anticuado. A medida que avanzas por aquel vasto espacio, escuchas un ruido que termina siendo un murciélago. ¿Qué harás ahora?</HTML>";
            case "1B":
                return "<HTML>Vuelves a casa y la intriga te sigue carcomiendo así que te interesas y comienzas a investigar en aquella fábrica que solía ser de Renault en los años 60 antes de su cierre en los 70 tras una fuerte crisis en la empresa. Aún sin encontrar nada ves que hay unos archivos en un blog con un estilo de hace unos 9/10 años, entras al blog y es un tipo de archivo de grabaciones en WMV. Es un diario de un señor explicando sus elocuencias y una historia un poco rara sobre un mundo virtual, al escucharlo piensas que estás loco pero sí que te das cuenta que las paredes son de la fábrica que fuiste a visitar con un tono más verdoso y claramente cuidadas.</HTML>";
            case "2A":
                return "<HTML>Al entrar huele a polvo pero ves que tienen botones aún funcionales, sólo hay 4 botones: Piso 0, Piso -1, Piso -2 y Piso -3. Vas a visitar el Piso -1 porque aunque parezca algún tipo de parking no hay salida de coches en toda la isla, el ascensor se cierra de una manera que nunca viste en un ascensor, al abrirse las puertas una sala iluminada de manera tenue te recibe con una silla y una especie de ordenador bastante grande. ¿Qué harás?</HTML>";
            case "2B":
                return "<HTML>Ese sentimiento te recorrió durante todo el camino y como aún no empezabas a dar clases te aburres pero prefieres estar en la Academia Kádic por tu propia seguridad. Tu amigo, Odd, te cuenta que ayer en el bosque Kádic encontró varias plantas y flores que en su presencia se tornaron negras. Tú no le crees, ya que, Odd suele tener bastantes fantasías y se inventa también muchas cosas. ¿Qué harás?</HTML>";
            case "2C":
                return "<HTML>Al seguir visitando la web descubres que el señor del video se llama Waldo Schaeffer, que es un investigador suizo que fue partícipe de un proyecto llamado Cartago, fue perseguido por gobiernos y tuvo que escapar a París después del secuestro de su mujer, después de todo esto inventó un programa de regreso al pasado porque su persecución llegaba a su fin, en detrimento de su hija, Aelita, eligió mandarla a ella a este mundo virtual llamado Lyoko, para salvarla de un secuestro y torturas en búsqueda de su padre. No entiendes nada de lo que ves, sólo sabes que parece demasiado desarrollado como para ser una invención. ¿Qué harás?</HTML>";
            case "2D":
                return "<HTML>Al llegar a la fábrica ves que hay unas flores negras junto a un árbol que en su base tiene raíces negras, te parece bastante extraño y continúas hacia la fábrica. Al llegar a la fábrica visitas las escaleras de la izquierda y te lleva a una sala de calderas que no parece en lo absoluto cuidada, tiene polvo y bastantes arañas, te dan miedo y por ello, sales cuanto antes. Antes de salir notas que te ha picado algo en el cuello, bajas a ver y con una mirada rápida ves una picadura, esto desencadena un ataque de ansiedad y comienzas a correr hacia la Academia en búsqueda de ayuda.</HTML>";
            case "3A":
                return "<HTML>El aspecto de este ordenador es como ningún otro que hayas visto, no tiene ningún botón de encendido, apagado o reseteo. Ves que justo detrás de este hay un tipo de proyector en el suelo de forma circular, al no conseguir encenderlo sigues visitando el resto de pisos en busca de respuestas. Al llegar al Piso -3 ves una sala bastante fría que cuenta con un botón en el centro, esta maquina parece algún tipo de maquinaria industrial. ¿Qué harás?</HTML>";
            case "3B":
                return "<HTML>Visitas el Piso -2 sin encontrar nada concluyente más que unas máquinas de unos 3 / 4 metros de altura con una forma cilíndrica con el interior iluminados en un blanco crema, no ves nada interesante y bajas otro piso. Al llegar al Piso -3 ves una sala bastante fría que cuenta con un botón en el centro, esta maquina parece algún tipo de maquinaria industrial. ¿Qué harás?</HTML>";
            case "3C":
                return "<HTML>Sigues a Odd al bosque y ves que algunas flores tienen unas esporas negras bastante extrañas, decidís no tocarlas porque desprenden un olor bastante particular, llamáis a Yumi y Ulrich para visitar todos juntos la fábrica como le dijiste a Odd. Al llegar a las puertas de la fábrica olía como a esas esporas y no os dio buena espina. Entráis y bajáis al ascensor que no fuiste capaz de visitar. Al entrar os dais cuenta de los 2 pisos disponibles. ¿Qué harás?</HTML>";
            case "3D":
                return "LINEA MUERTA";
            case "3E":
                return "XXXXX";
            case "3F":
                return "LINEA MUERTA";
            case "3G":
                return "<HTML>Al llegar a la Academia Kádic asistes a enfermería y te estás hinchando ligeramente, desconocías tu alergia a las arañas, así que, intentan reducir la reacción pero no lo consiguen así que llaman a la ambulancia para que te lleven al hospital. En tu camino sientes que no consigues respirar como antes, lo avisas y te asisten. Al llegar al hospital hay unos señores de negro que junto a los doctores te esperan. Te parece extraño pero decides descansar.</HTML>";
            case "4A":
                return "XXXX";
            case "4B":
                return "<HTML>Lastimosamente, no sabías que quizás esa cosa aún tenía energía y calor, y al pisar encima y atascarte entre los espacios pequeños interiores en el circulo te has llevado una descarga de más de 300V y no sobreviviste.</HTML>";
            default:
                return "MainOutput failed.";
        }

    }

    private static String gameOverFrame(String language) {
        JFrame frame = new JFrame("Conversational Game | DHR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = Color.LIGHT_GRAY; // Lightest gray
                Color color2 = getBackground(); // Default color
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fill(new Rectangle2D.Double(0, 0, width, height));
            }
        };

        JLabel MainTitle = new JLabel("GAME OVER", SwingConstants.CENTER);
        MainTitle.setBorder(new EmptyBorder(20, 10, 10, 10));
        MainTitle.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel Body = new JLabel("<HTML><center>Lo podrías haber hecho mejor, has elegido una serie de decisiones erróneas que te han llevado a tu situación actual.</center></HTML>", SwingConstants.CENTER);
        Body.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Body.setBorder(new EmptyBorder(0, 20, 20, 20));

        JPanel Panel = new JPanel();
        JButton O1 = new JButton("Volver al menú.");
        O1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Languages.main();
            }
        });
        JButton O2 = new JButton("Cerrar el juego.");
        O2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        Panel.add(O1);
        Panel.add(O2);

        gradientPanel.setLayout(new BorderLayout());
        gradientPanel.add(MainTitle, BorderLayout.NORTH);
        gradientPanel.add(Body, BorderLayout.CENTER);
        gradientPanel.add(Panel, BorderLayout.SOUTH);

        frame.setContentPane(gradientPanel);
        frame.setVisible(true);
        return "";
    }
   
    private static String errorScreen(String errorText) {
        JFrame frame = new JFrame("Conversational Game | DHR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
        // Change the background color to a whiter red
        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(255, 200, 200)); // A whiter shade of red
    
        JLabel MainTitle = new JLabel("Error", SwingConstants.CENTER);
        MainTitle.setBorder(new EmptyBorder(20, 10, 10, 10));
        MainTitle.setFont(new Font("Segoe UI", Font.BOLD, 30));
    
        JLabel Body = new JLabel(errorText, SwingConstants.CENTER);
        Body.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Body.setBorder(new EmptyBorder(0, 20, 20, 20));
    
        JPanel Panel = new JPanel();
        Panel.setBackground(new Color(255, 200, 200));
        JButton O1 = new JButton("Return to the menu");
        O1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Languages.main();
            }
        });
        JButton O2 = new JButton("Exit the game");
        O2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    
        Panel.add(O1);
        Panel.add(O2);
    
        redPanel.setLayout(new BorderLayout());
        redPanel.add(MainTitle, BorderLayout.NORTH);
        redPanel.add(Body, BorderLayout.CENTER);
        redPanel.add(Panel, BorderLayout.SOUTH);
    
        frame.setContentPane(redPanel);
        frame.setVisible(true);
        return "";
    }
    
    public static void main(String[] args) {
        errorScreen("Error code: 423");
    }
}