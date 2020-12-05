package abstractdata;

import java.util.List;
import java.util.Map;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

import api.MediaApi;
import controller.CartController;
import editdialog.BookEditDialog;
import editdialog.MediaEditDialog;
import media.AdminMediaListPane;

public abstract class AdminMediaPageController extends ADataPageController<Media> {

	
	
	
	public AdminMediaPageController() {
		super();
	}
	
	public AdminMediaPageController(CartController cartController) {
		this();
		
	}
	
	
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	public abstract void ShowEdit(Media media);
}
