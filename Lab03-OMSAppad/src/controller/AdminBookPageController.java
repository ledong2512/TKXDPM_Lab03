package controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.AdminMediaPageController;
import abstractdata.IDataManageController;
import api.MediaApi;
import editdialog.BookEditDialog;
import media.BookSearchPane;
import media.BookSinglePane;
import media.MediaSearchPane;
import media.MediaSinglePane;

public class AdminBookPageController extends AdminMediaPageController{
	
	private BookEditDialog dialog;
	private IDataManageController<Media> controller;
	
	public AdminBookPageController() {
		super();
	}
	public AdminBookPageController(CartController cartController) {
		super(cartController);
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	

	
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
	@Override
	public void ShowEdit(Media media) {
		 {
				if (media instanceof Book) {
					 controller= new IDataManageController<Media>() {
					
					

						@Override
						public void create(Media t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void read(Media t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void delete(Media t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void update(Media t) {
							Book book= (Book) t;
							 new MediaApi().updateBook(book);
							
						};
					};
					dialog=new BookEditDialog(media, controller);
					
				}
				
			}
		
	}
	
	
	
}
