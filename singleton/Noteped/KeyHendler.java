
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class KeyHendler implements KeyListener{
	private static KeyHendler kHendler = null;
	Notepad gui;
	private KeyHendler(Notepad gui)
	{
		this.gui = gui;
	}
	public static KeyHendler getKeyHendler(Notepad notepad)
	{
		if (kHendler == null)
		{
			synchronized (KeyHendler.class)
			{     
				if(kHendler == null)
				{
					kHendler = new KeyHendler(notepad);
					return kHendler;
				}
			}
		}
			return null;
	}
	@Override
	public void keyTyped(KeyEvent e){
				
	}
	@Override
	public void keyPressed(KeyEvent e){
		try
		{
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S)
			{
				gui.file.saveFile();//ctrl+s->Save The File
			}
			if(e.isShiftDown() &&  e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S)
			{
				gui.file.saveAsFile();//Shift+ctrl+s->SaveAs The File
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Z)
			{
				gui.edit.undo();//ctrl+z->Undoo
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Y)
			{
				gui.edit.redo();//ctrl+y->Redo 
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_W)
			{
				gui.file.ExitFile();//ctrl+w->Close The file
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_O)
			{
				gui.file.OpenFile();//ctrl+O->open the File	
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_N)
			{
				gui.file.newFile();//ctrl+N->New the File
			}
			if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_F)
			{
				gui.menuFile.doClick();//ctrl+F->the Click File Menu
			}
		}
		catch(Exception e){
			System.out.println("Key not Work");
		}
	}
	@Override
	public void keyReleased(KeyEvent e){
		
	}

}