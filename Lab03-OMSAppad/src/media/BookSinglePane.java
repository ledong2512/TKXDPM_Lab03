package media;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;


@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	 
	private JLabel labelPublisher;
	private JLabel labelPublishcationDate;
	private JLabel labelAuthor;
	private JLabel labelNumberOfPages;
	private JLabel labelLanguage;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}

	
	@Override
	public void buildControls() {
		super.buildControls();
		
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublishcationDate = new JLabel();
		add(labelPublishcationDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthor = new JLabel();
		add(labelAuthor, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfPages = new JLabel();
		add(labelNumberOfPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
	}
	
	
	@Override
	public void displayData() {
	super.displayData();
		
		if (t instanceof Book) {
			Book book = (Book) t;
		
			labelPublisher.setText("Publisher: " + book.getPublisher());
			labelPublishcationDate.setText("Punlishcation date: " + book.getPublicationDate());
			labelAuthor.setText("Author: " + book.getAuthors());
			labelNumberOfPages.setText("Number of Pages: " + book.getNumberOfPages());
			labelLanguage.setText("Language: " + book.getLanguage());
		}
	}
}
