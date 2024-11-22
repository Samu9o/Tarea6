package co.edu.uniandes.graphics.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;
public class PanelLienzo extends JPanel {

    @Override
    public void paint(Graphics g) {
        // Llamar al método paint de la clase base
        super.paint(g);

        // Convertir Graphics a Graphics2D
        Graphics2D g2d = (Graphics2D) g;
       

        // Aquí se dibujarán las figuras una vez tengamos los datos
        // Ejemplo básico de una figura: un rectángulo
        g2d.setColor(Color.GRAY);
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0,0,800,800);
        g2d.draw(rectangle);
        g2d.fill(rectangle);
        g2d.setColor(Color.BLACK);
        Ellipse2D.Double ELIPSE = new Ellipse2D.Double(350,30,100,100);
        g2d.draw(ELIPSE);
        g2d.fill(ELIPSE);
        Rectangle2D.Double rectangle1 = new Rectangle2D.Double(390,130,20,40);
        g2d.draw(rectangle1);
        g2d.fill(rectangle1);
        RoundRectangle2D.Double rectangle2 = new RoundRectangle2D.Double(455,170,25,180,20,20);
        g2d.draw(rectangle2);
        g2d.fill(rectangle2);
        RoundRectangle2D.Double rectangle3 = new RoundRectangle2D.Double(320,170,25,180,20,20);
        g2d.draw(rectangle3);
        g2d.fill(rectangle3);
        Rectangle2D.Double rectangle4 = new Rectangle2D.Double(335,170,130,40);
        g2d.draw(rectangle4);
        g2d.fill(rectangle4);
        g2d.setColor(Color.GRAY);
        RoundRectangle2D.Double rectangle5 = new RoundRectangle2D.Double(345,200, 15, 40,20,20);
        g2d.draw(rectangle5);
        g2d.fill(rectangle5);
        RoundRectangle2D.Double rectangle6 = new RoundRectangle2D.Double(440,200, 15, 40,20,20);
        g2d.draw(rectangle6);
        g2d.fill(rectangle6);
        g2d.setColor(Color.BLACK);
        Rectangle2D.Double rectangle7 = new Rectangle2D.Double(360,170,80,180);
        g2d.draw(rectangle7);
        g2d.fill(rectangle7);
        RoundRectangle2D.Double rectangle8 = new RoundRectangle2D.Double(360,330,35,180,20,20);
        g2d.draw(rectangle8);
        g2d.fill(rectangle8);
        RoundRectangle2D.Double rectangle9 = new RoundRectangle2D.Double(405,330,35,180,20,20);
        g2d.draw(rectangle9);
        g2d.fill(rectangle9);
        // Coordenadas del polígono
        int[] xPoints = {230, 250, 550, 570};	
        int[] yPoints = {550, 500, 500, 550};
        int nPoints = xPoints.length;
        
       

        // Reloj
        g2d.setColor(Color.BLACK);

        // Contorno del reloj
        Ellipse2D.Double relojContorno = new Ellipse2D.Double(200, 100, 200, 200);
        g2d.draw(relojContorno);

        // Marcas de las horas
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30); // 360° / 12 = 30°
            double x1 = 300 + 90 * Math.cos(angle); // Punto externo
            double y1 = 200 - 90 * Math.sin(angle);
            double x2 = 300 + 80 * Math.cos(angle); // Punto interno
            double y2 = 200 - 80 * Math.sin(angle);
            g2d.draw(new Line2D.Double(x1, y1, x2, y2));
        }

        // Aguja de las horas
        g2d.setStroke(new BasicStroke(4));
        double hourAngle = Math.toRadians(90 - 90); // Ejemplo: 3 en punto (90°)
        double hourX = 300 + 50 * Math.cos(hourAngle);
        double hourY = 200 - 50 * Math.sin(hourAngle);
        g2d.draw(new Line2D.Double(300, 200, hourX, hourY));

        // Aguja de los minutos
        g2d.setStroke(new BasicStroke(2));
        double minuteAngle = Math.toRadians(90 - 180); // Ejemplo: 6 en punto (180°)
        double minuteX = 300 + 70 * Math.cos(minuteAngle);
        double minuteY = 200 - 70 * Math.sin(minuteAngle);
        g2d.draw(new Line2D.Double(300, 200, minuteX, minuteY));

        // Aguja de los segundos
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.RED);
        double secondAngle = Math.toRadians(90 - 270); // Ejemplo: 9 en punto (270°)
        double secondX = 300 + 80 * Math.cos(secondAngle);
        double secondY = 200 - 80 * Math.sin(secondAngle);
        g2d.draw(new Line2D.Double(300, 200, secondX, secondY));

        // Centro del reloj
        g2d.setColor(Color.BLACK);
        g2d.fillOval(295, 195, 10, 10);

        // Dibujar y rellenar el polígono
        g2d.fillPolygon(xPoints, yPoints, nPoints);
        
        g2d.setColor(Color.LIGHT_GRAY);

        // Parte superior (arcos para las curvas de la nube)
        g2d.fillArc(50, 100, 50, 50, 0, 180);  // Arco izquierdo
        g2d.fillArc(75, 90, 60, 60, 0, 180);   // Arco central
        g2d.fillArc(120, 100, 50, 50, 0, 180); // Arco derecho

        // Parte inferior (un rectángulo simple para la base)
        g2d.fillRect(60, 125, 100, 30);

        // Detalle: bordes más oscuros
        g2d.setColor(Color.GRAY);
        g2d.drawArc(50, 100, 50, 50, 0, 180);  // Borde izquierdo
        g2d.drawArc(75, 90, 60, 60, 0, 180);   // Borde central
        g2d.drawArc(120, 100, 50, 50, 0, 180); // Borde derecho
        g2d.drawRect(60, 125, 100, 30);        // Borde inferior
        Star star = new Star(0, 0); // Create a star
        float delta = 60f; // Increment between stars
        float starty = 0f; // Starting y position

        // Draw 3 rows of 4 stars
        for (int yCount = 0; yCount < 1; yCount++) {
            starty += delta; // Increment row position
            float startx = 0f; // Start x position in a row

            // Draw a row of 4 stars
            for (int xCount = 0; xCount < 1; xCount++)
                g2d.draw(star.atLocation(startx += delta, starty));
            
        }
     // Configuración del color de la figura
        g2d.setColor(Color.YELLOW);
     // Configuración del color de la estrella
     // Configuración del color de la estrella
        g2d.setColor(Color.YELLOW);

        // Centro de la figura
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Tamaño de la estrella
        int sizeOuter = 150; // Tamaño de los picos exteriores
        int sizeInner = 32;  // Tamaño de los puntos interiores (mucho más pequeños)

        // Coordenadas de los vértices de la estrella (en orden para formar los picos y las intersecciones)
        int[] xPointss = {
            centerX,                          // Pico superior
            centerX + sizeInner,              // Punto intermedio derecho
            centerX + sizeOuter,              // Pico derecho
            centerX + sizeInner,              // Punto intermedio inferior derecho
            centerX,                          // Pico inferior
            centerX - sizeInner,              // Punto intermedio inferior izquierdo
            centerX - sizeOuter,              // Pico izquierdo
            centerX - sizeInner               // Punto intermedio superior izquierdo
        };

        int[] yPointss = {
            centerY - sizeOuter,              // Pico superior
            centerY - sizeInner,              // Punto intermedio derecho
            centerY,                          // Pico derecho
            centerY + sizeInner,              // Punto intermedio inferior derecho
            centerY + sizeOuter,              // Pico inferior
            centerY + sizeInner,              // Punto intermedio inferior izquierdo
            centerY,                          // Pico izquierdo
            centerY - sizeInner               // Punto intermedio superior izquierdo
        };

        // Crear el polígono
        Polygon estrella = new Polygon(xPointss, yPointss, 8);

        // Dibujar y rellenar la estrella
        int sizeOuterr = 150; // Tamaño de los picos exteriores
        int controlOffset = 75; // Desplazamiento de los puntos de control para hacerla más curva

        // Crear la forma de estrella usando GeneralPath para mayor flexibilidad
        GeneralPath estrellaa = new GeneralPath();

        // Moverse al primer punto (pico superior)
        estrellaa.moveTo(centerX, centerY - sizeOuterr);

        // Dibujar curvas suaves hacia los otros puntos de la estrella
        estrellaa.quadTo(centerX + sizeInner, centerY - sizeInner, centerX + sizeOuterr, centerY);  // Curva hacia el pico derecho
        estrellaa.quadTo(centerX + sizeInner, centerY + sizeInner, centerX, centerY + sizeOuterr);  // Curva hacia el pico inferior
        estrellaa.quadTo(centerX - sizeInner, centerY + sizeInner, centerX - sizeOuterr, centerY);  // Curva hacia el pico izquierdo
        estrellaa.quadTo(centerX - sizeInner, centerY - sizeInner, centerX, centerY - sizeOuterr);  // Curva hacia el pico superior


        // Cerrar la figura
        estrellaa.closePath();

        // Dibujar y rellenar la estrella
        g2d.fill(estrellaa);
     
        
    }
        
    }
