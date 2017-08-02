package comxmausoleumx.httpsgithub.pairity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
    }

    Button loginButton = (Button) findViewById(R.id.button);
    loginButton.setOnClickListener(new View.onClickListener() {
        @Override
        public void onClick(View v) {
            goToMainPage();
        }
    });

    private void goToMainPage(){
        Intent intent = new Intent(this, mainpage.class);
        startActivity(intent);
    }
}
