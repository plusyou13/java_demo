package cn6.command;


//��������ӿ�
public interface Command {

	//ִ�ж���(����)
	public void execute();
	//��������(����)
	public void undo();
}
