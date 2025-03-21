package Behavioural;

import java.util.Stack;

interface Command
{
    void execute();
    void undo();
    void redo();
}
class TextEditorCommand implements Command
{
//receiver
    Text t;
    public TextEditorCommand(Text t)
    {
        this.t=t;
    }
    @Override
    public void execute() {
        t.text.append(t.str);
    }

    @Override
    public void undo() {
        t.text.delete(t.text.length()-t.str.length(),t.text.length());
    }

    @Override
    public void redo() {
        execute();
    }
}
//receiver
class Text
{
    StringBuilder text;
    String str;
    public Text(StringBuilder text,String str)
    {
        this.text=text;
        this.str=str;
    }
}
class CommandManager
{
    Stack<Command> undoStack= new Stack<>();
    Stack<Command> redoStack = new Stack<>();
    public void processCommand(Command c)
    {
        c.execute();
        undoStack.push(c);
        redoStack.clear();
    }
    public void undo()
    {
        if(undoStack.size()>0)
        {
            Command c = undoStack.pop();
            c.undo();
            redoStack.push(c);
        }
        else
        {
            System.out.println(" their is nothing to undo ");
        }
    }
    public void redo()
    {
        if(redoStack.size()>0)
        {
            Command c = redoStack.pop();
            c.execute();
            undoStack.push(c);
        }
        else
        {
            System.out.println(" their is nothing to redo ");
        }
    }
}


public class TextEditorDemo {
    public static void main(String[] args) {
        CommandManager cmd = new CommandManager();
        Text t=new Text(new StringBuilder("shashank"),"abc");
        Command c= new TextEditorCommand(t);
        cmd.processCommand(c);
        cmd.processCommand(c);
        System.out.println(t.text.toString());
        cmd.undo();
        System.out.println(t.text.toString());
        cmd.redo();
        System.out.println(t.text.toString());
        cmd.undo();
        cmd.undo();
        System.out.println(t.text.toString());

    }
}
