package com.example.testdesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.testdesign.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JeeMockTest#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JeeMockTest extends Fragment {

    Button button1;
    CheckBox checkBox1;
    NavController navController;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JeeMockTest() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JeeMockTest.
     */
    // TODO: Rename and change types and number of parameters
    public static JeeMockTest newInstance(String param1, String param2) {
        JeeMockTest fragment = new JeeMockTest();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jee_mock_test2, container, false);
        NavController navController = NavHostFragment.findNavController(this);


        button1 = view.findViewById(R.id.startTestButton);

        checkBox1= (CheckBox) view.findViewById( R.id.checkBox1);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    button1.setEnabled(true);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    NavDirections nav2 = JeeMockTestDirections.actionJeeMockTestToFragmentMathematicsJeeMockTest();

                                    navController.navigate(nav2);

                                }
                            });
                        }
                    });

                }else{
                    button1.setEnabled(false);
                }

            }
        });



        return view;
    }
}