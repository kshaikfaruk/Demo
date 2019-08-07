

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author shaikfaruk
 */
public class Graph extends javax.swing.JFrame {

    /**
     * Creates new form BarChart
     */
  

        public Graph(String appTitle) {
		super(appTitle);

		// Create Dataset
		CategoryDataset dataset = createDataset();

		// Create chart
		JFreeChart chart = ChartFactory.createBarChart(
				"Reliability of System with Human Error", // Chart
				// Title
				"Probability of Human Error with common cause", // Category axis
				"Probabilities of pi(t)", // Value axis
				dataset, PlotOrientation.VERTICAL, true, true, false);

		ChartPanel panel = new ChartPanel(chart);
		setContentPane(panel);
	}

	private CategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		Equations e=new Equations();
		  // p1(t)
                dataset.addValue(e.equ_1(0.10, 0.20, 0.30, 0.40,0.04,0.25,0.35,0.45, 3), "t=2", "p1(t)");
		        dataset.addValue(e.equ_1(0.10, 0.20, 0.30, 0.40,0.04,0.25,0.35,0.45, 2), "t=3", "p1(t)");
               dataset.addValue(e.equ_1(0.10, 0.20, 0.30, 0.40,0.04,0.25,0.35,0.45, 4), " t=4", "p1(t)");
		       dataset.addValue(e.equ_1(0.10, 0.20, 0.30, 0.40,0.04,0.25,0.35,0.45, 5), "t=5", "p1(t)");
                		
                  //p2(t)
                dataset.addValue(e.equ_2(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45,3), "t=2","p2(t)");
		        dataset.addValue(e.equ_2(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45,2),"t=3", "p2(t)");
                dataset.addValue(e.equ_2(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4","p2(t)");
		        dataset.addValue(e.equ_2(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p2(t)");
		        
		        //p3(t)
		         dataset.addValue(e.equ_14(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", " p3(t) ");
		         dataset.addValue(e.equ_14(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2), "t=3", " p3(t) ");
                dataset.addValue(e.equ_14(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", " p3(t) ");
		        dataset.addValue(e.equ_14(0.10, 0.20, 0.30, 0.40,0.04, 00.25, 0.35, 0.45,5), "t=5", " p3(t) ");
            
		         
		         //p4(t)
                dataset.addValue(e.equ_3(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", "p4(t)");
		        dataset.addValue(e.equ_3(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45,2), "t=3", "p4(t)");
		       dataset.addValue(e.equ_3(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", "p4(t)");
		        dataset.addValue(e.equ_3(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p4(t)");
               
               
              
		      //p5(t)
                dataset.addValue(e.equ_4(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", "p5(t)");
	         	dataset.addValue(e.equ_4(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2), "t=3", "p5(t)");
	         	dataset.addValue(e.equ_4(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", "p5(t)");
		      dataset.addValue(e.equ_4(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p5(t)");
               
               
		      
		    //p6(t)
		      
		      
		      dataset.addValue(e.equ_5(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", "p6(t)");
	         dataset.addValue(e.equ_5(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2), "t=3", "p6(t)");
             dataset.addValue(e.equ_5(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", "p6(t)");
             dataset.addValue(e.equ_5(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p6(t)");
		      
            
		    //p7(t)
                dataset.addValue(e.equ_6(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", "p7(t)");
		       dataset.addValue(e.equ_6(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2), "t=3", "p7(t)");
                dataset.addValue(e.equ_6(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", "p7(t)");
		      dataset.addValue(e.equ_6(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p7(t)");
               
		     //p8(t)
               
                dataset.addValue(e.equ_7(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3), "t=2", "p8(t)");
		        dataset.addValue(e.equ_7(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2), "t=3", "p8(t)");
               dataset.addValue(e.equ_7(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4), " t=4", "p8(t)");
            dataset.addValue(e.equ_7(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5), "t=5", "p8(t)");
               
               
               
		
		      //p9(t)
               
               dataset.addValue(e.equ_8(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,3) , "t=2", "p9(t)");
		        dataset.addValue(e.equ_8(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,2) , "t=3", "p9(t)");
             dataset.addValue(e.equ_8(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,4) , " t=4", "p9(t)");
		        dataset.addValue(e.equ_8(0.10, 0.20, 0.30, 0.40,0.04, 0.25, 0.35, 0.45,5) , "t=5", "p9(t)");
		        
		       
		//p10(t)
                dataset.addValue(e.equ_9(0.10, 0.20, 0.30, 0.40, 0.04 ,0.25, 0.35, 0.45, 3), "t=2", "p10(t)");
               dataset.addValue(e.equ_9(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 2), "t=3", "p10(t)");
               dataset.addValue(e.equ_9(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 4), " t=4", "p10(t)");
                 dataset.addValue(e.equ_9(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 5), "t=5", "p10(t)");
               
             
		       //p11(t)    
                dataset.addValue(e.equ_10(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 3), "t=2", "p11(t)");
		         dataset.addValue(e.equ_10(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 2), "t=3", "p11(t)");
             dataset.addValue(e.equ_10(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 4), " t=4", "p11(t)");
              dataset.addValue(e.equ_10(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 5), "t=5", "p11(t)");
               
              
               
		       //p12(t)
                dataset.addValue(e.equ_11(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 3) , "t=2", "p12(t)");
                dataset.addValue(e.equ_11(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 2) , "t=3", "p12(t)");
                dataset.addValue(e.equ_11(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 4) , " t=4", "p12(t)");
           dataset.addValue(e.equ_11(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 5) , "t=5", "p12(t)");
            
               
               
               
		     //p13(t)
                dataset.addValue(e.equ_12(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 3)  , "t=2", "p13(t)");
		        dataset.addValue(e.equ_12(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 2)  , "t=3", "p13(t)");
		      dataset.addValue(e.equ_12(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 4)  , " t=4", "p13(t)");
		     dataset.addValue(e.equ_12(0.10, 0.20, 0.30, 0.40, 0.04, 0.25, 0.35, 0.45, 5)  , "t=5", "p13(t)");
                          
          	return dataset;
	}

        
        	        
       public static void main(String[] args) throws Exception {
		SwingUtilities.invokeAndWait(new Runnable() {

			@Override
			public void run() {
				Graph example = new Graph(
						"Bar Chart Window");
				example.setSize(800,400);
				example.setLocationRelativeTo(null);
				example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				example.setVisible(true);
			}
		});
	}
}


                     



