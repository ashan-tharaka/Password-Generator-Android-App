package com.example.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
EditText edit_len;
CheckBox Checklower,CheckUpper,CheckNum,CheckSym;
Button btn_Copy,btn_Gen,btn_reset;
TextView textView,txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_len=(EditText)findViewById(R.id.edit_len);

        Checklower=(CheckBox)findViewById(R.id.checklower);
        CheckUpper=(CheckBox)findViewById(R.id.Checkupper);
        CheckNum=(CheckBox)findViewById(R.id.CheckNum);
        CheckSym=(CheckBox)findViewById(R.id.CheckSym);
        btn_Copy=(Button)findViewById(R.id.btn_Copy);
        btn_Gen=(Button)findViewById(R.id.btn_Gen);
        btn_reset=(Button)findViewById(R.id.btn_reset);
        textView=(TextView)findViewById(R.id.text_pass);
        txt=(TextView)findViewById(R.id.txt);

        btn_Gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==true&&CheckNum.isChecked()==true){

                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");

                    textView.setText(GetPassword(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==true && CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword1(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==false && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword2(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==true && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword3(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==true && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword4(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==true && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword5(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==false && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword6(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==true && CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword7(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==false && CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword8(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==true&& CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword9(len));
                }

                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==false&& CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword10(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==true&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==false&& CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword11(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==true&&CheckSym.isChecked()==false&& CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword12(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==true&& CheckNum.isChecked()==false){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword13(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==false&& CheckNum.isChecked()==true){


                    int len=Integer.parseInt(edit_len.getText().toString());
                    txt.setText("Your Password:");
                    textView.setText(GetPassword14(len));
                }
                else if(!"".contentEquals(edit_len.getText().toString())&&Checklower.isChecked()==false&& CheckUpper.isChecked()==false&&CheckSym.isChecked()==false&& CheckNum.isChecked()==false){

Toasty.error(MainActivity.this,"Please select password content option or options",Toasty.LENGTH_LONG).show();

                }


                else{
     Toasty.warning(MainActivity.this,"Please fill length field.", Toast.LENGTH_LONG).show();
                }
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception

                }

            }
        });

        btn_Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!"".contentEquals(textView.getText().toString())){
                    try{
                        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData clip = ClipData.newPlainText("Copied text", textView.getText().toString());
                        clipboard.setPrimaryClip(clip);
                        Toasty.success(MainActivity.this,"Copied the password to Clipboard ",Toast.LENGTH_LONG).show();

                    }catch (Exception e){
                        Toasty.error(MainActivity.this,"Not Copied",Toasty.LENGTH_LONG).show();

                    }

                }else{
                    Toasty.info(MainActivity.this,"First Generate a Password").show();
        }
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_len.setText("");
                CheckNum.setChecked(false);
                CheckSym.setChecked(false);
                CheckUpper.setChecked(false);
                Checklower.setChecked(false);
                textView.setText("");
                txt.setText("");

            }
        });

    }
    public String GetPassword(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword1(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword2(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword3(int length){
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword4(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword5(int length){
        char[] chars = "0123456789!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword6(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword7(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword8(int length){
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword9(int length){
        char[] chars = "abcdefghijklmnopqrstuvwxyz!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword10(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword11(int length){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword12(int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword13(int length){
        char[] chars = "!@#$%^&*_+?".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    public String GetPassword14(int length){
        char[] chars = "0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}