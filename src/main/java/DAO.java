import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class DAO {

    public void insert(){

        StringBuffer buffer = new StringBuffer();
        StringBuffer values = new StringBuffer();


        String a = "INSERT INTO "+ this.getClass().getSimpleName()+"  "+this.getClass().getFields();
        buffer.append("INSERT INTO ");
        buffer.append(this.getClass().getSimpleName());
        buffer.append(" (");
        for( Field field : this.getClass().getDeclaredFields()){
            buffer.append(field.getName()+",");

        }
        buffer.delete(buffer.length()-1,buffer.length());
        buffer.append(") ");
        buffer.append("Values");
        buffer.append(" (");
        for(Method method : this.getClass().getDeclaredMethods()){
            if (method.getName().startsWith("get"))
                try{
                    buffer.append(method.invoke(this,null).toString() + ",");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

        }
        buffer.delete(buffer.length()-1,buffer.length());
        buffer.append(") ");


        System.out.println(buffer.toString());

    };
    public void select() {};
    public void update(){};
    public void delete(){};

}
