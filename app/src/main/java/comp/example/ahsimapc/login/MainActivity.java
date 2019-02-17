package comp.example.ahsimapc.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private    EditText username;
    private EditText password;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        button=(Button) findViewById(R.id.login_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1=username.getText().toString();
                String password1=password.getText().toString();

                if(username1.equals("")&&password1.equals(""))
                {

                    Toast.makeText(getApplication(), "Username and Password cannot be empty ", Toast.LENGTH_SHORT).show();
                }else
                {
                    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                    if(!username1.matches(emailPattern))
                    {
                        Toast.makeText(getApplication(),"Invalid Email",Toast.LENGTH_SHORT).show();
                    }else
                    {


                        if(password1.length()<6)
                        {
                            Toast.makeText(MainActivity.this, "Password must be 6 character long", Toast.LENGTH_LONG).show();
                        }
                        else
                        {

                            Toast.makeText(getApplication(),"Login Successfull",Toast.LENGTH_SHORT).show();
                        }
                    }


                }

            }
        });



    }
}
