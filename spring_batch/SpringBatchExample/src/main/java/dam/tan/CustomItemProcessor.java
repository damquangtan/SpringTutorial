package dam.tan;

import org.springframework.batch.item.ItemProcessor;

import dam.tan.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}
}
