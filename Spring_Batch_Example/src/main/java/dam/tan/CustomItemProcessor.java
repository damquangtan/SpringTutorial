package dam.tan;

import org.springframework.batch.item.ItemProcessor;

import dam.tan.model.Report;

/*Một itemProcessor sẽ được kích hoạt trước itemWriter*/
public class CustomItemProcessor implements ItemProcessor<Report, Report>{

	public Report process(Report item) throws Exception {
		System.out.println("Processing...");
		return item;
	}
	
}
