package media;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel labelPublisher;
	private JLabel labelPublishDate;
	private JLabel labelAuthors;
	private JLabel labelNoP;
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
		labelPublishDate = new JLabel();
		add(labelPublishDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthors = new JLabel();
		add(labelAuthors, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNoP = new JLabel();
		add(labelNoP, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
	}
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof PhysicalMedia) {
			Book pMedia = (Book) t;
			
			labelAuthors.setText("Authors: " + pMedia.getAuthors());
			labelLanguage.setText("Language: " + pMedia.getLanguage());
			labelNoP.setText("NoP: " + pMedia.getNumberOfPages());
			labelPublishDate.setText("Publish Date: " + pMedia.getPublicationDate());
			labelPublisher.setText("Publisher: " + pMedia.getPublisher());
		}
	}
	
}
