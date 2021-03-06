package com.gigamole.sample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gigamole.SoGood.ntb.NavigationTabBar;

import java.util.ArrayList;

/**
 * Created by GIGAMOLE on 28.03.2016.
 */
public class Good_Introduce extends AppCompatActivity {


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_good_introduce );
        initUI();
    }

    private void initUI() {

        final ViewPager viewPager = (ViewPager) findViewById( R.id.vp_today_good );
        viewPager.setAdapter( new PagerAdapter() {
            @Override
            public int getCount() {
                return 7;
            }

            @Override
            public boolean isViewFromObject(final View view, final Object object) {
                return view.equals( object );
            }

            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView( (View) object );
            }

            @Override
            public Object instantiateItem(final ViewGroup container, final int position) {
                if (position == 0) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 1) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter2( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 2) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter3( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 3) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter4( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 4) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter5( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 5) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter6( this ) );

                    container.addView( view );
                    return view;
                } else if (position == 6) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter7( this ) );

                    container.addView( view );
                    return view;
                }
                return null;
            }
        } );

        final String[] colors = getResources().getStringArray( R.array.default_preview );

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById( R.id.ntb_horizontal );
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.sticker ),
                        Color.parseColor( colors[1] ) )
                        .title( "?????????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.print ),
                        Color.parseColor( colors[1] ) )
                        .title( "??????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.card ),
                        Color.parseColor( colors[1] ) )
                        .title( "????????????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.banner ),
                        Color.parseColor( colors[1] ) )
                        .title( "??????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.note ),
                        Color.parseColor( colors[1] ) )
                        .title( "??????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.mirror ),
                        Color.parseColor( colors[1] ) )
                        .title( "??????" )
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable( R.drawable.pancy ),
                        Color.parseColor( colors[1] ) )
                        .title( "??????" )
                        .build()
        );
        navigationTabBar.setModels( models );
        navigationTabBar.setViewPager( viewPager, 0 );
        navigationTabBar.setOnTabBarSelectedIndexListener( new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {

            }

            @Override
            public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {

            }
        } );

        findViewById( R.id.mask ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                for (int i = 0; i < navigationTabBar.getModels().size(); i++) {
                    navigationTabBar.postDelayed( new Runnable() {
                        @Override
                        public void run() {

                        }
                    }, i * 100 );
                }
            }
        } );

    }


    public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

        Context context;

        public RecycleAdapter(Context context) {
            this.context = context;
        }

        public RecycleAdapter(PagerAdapter pagerAdapter) {
        }

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_sticker);//?????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_tomson);//?????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_metalsticker);//??????
            } else if (position == 3) {
                holder.img.setImageResource(R.drawable.list_button_removable);//????????????
            }

        }

        @Override
        public int getItemCount() {

            return 4;
        } //20???


        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, SquareSticker.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, Domusong.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, Jeonchase.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 3) {
                    Intent i = new Intent( Good_Introduce.this, Removable.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }


    public class RecycleAdapter2 extends RecyclerView.Adapter<RecycleAdapter2.ViewHolder> {

        Context context;

        public RecycleAdapter2(Context context) {
            this.context = context;
        }

        public RecycleAdapter2(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter2.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter2.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_pyrophotograph);//????????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_poster);//?????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_polaroid);//???????????????
            } else if (position == 3) {
                holder.img.setImageResource(R.drawable.list_button_idpicture);//????????????
            } else if (position == 4) {
                holder.img.setImageResource(R.drawable.list_button_calendar);//?????????
            } else if (position == 5) {
                holder.img.setImageResource(R.drawable.list_button_garland);//?????????
            } else if (position == 6) {
                holder.img.setImageResource(R.drawable.list_button_photobook);//?????????
            }

        }

        @Override
        public int getItemCount() {

            return 7;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, Print.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, Poster.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, Polaroid.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 3) {
                    Intent i = new Intent( Good_Introduce.this, IDpicture.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }else if (position == 4) {
                    Intent i = new Intent( Good_Introduce.this, Calender.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 5) {
                    Intent i = new Intent( Good_Introduce.this, Garadeda.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }

    public class RecycleAdapter3 extends RecyclerView.Adapter<RecycleAdapter3.ViewHolder> {

        Context context;

        public RecycleAdapter3(Context context) {
            this.context = context;
        }

        public RecycleAdapter3(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter3.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter3.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_photocard);//????????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_transparentphoto);//??????????????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_hologram);//??????????????????
            } else if (position == 3) {
                holder.img.setImageResource(R.drawable.list_button_postcard);//??????
            }
        }

        @Override
        public int getItemCount() {

            return 4;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();

                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, Photocard.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, Transparent.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, Hologram.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }

    public class RecycleAdapter4 extends RecyclerView.Adapter<RecycleAdapter4.ViewHolder> {

        Context context;

        public RecycleAdapter4(Context context) {
            this.context = context;
        }

        public RecycleAdapter4(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter4.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter4.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_minibanner);//????????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_canvasbanner);//???????????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_scrollrods);//?????????
            }
        }

        @Override
        public int getItemCount() {

            return 3;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, Minibanner.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, CanvasBanner.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, Deungsindae.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }

    public class RecycleAdapter5 extends RecyclerView.Adapter<RecycleAdapter5.ViewHolder> {

        Context context;

        public RecycleAdapter5(Context context) {
            this.context = context;
        }

        public RecycleAdapter5(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter5.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter5.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_memo);//????????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_note);//???????????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_studyplanner);//??????????????????
            } else if (position == 3) {
                holder.img.setImageResource(R.drawable.list_button_postit);//????????????
            }
        }

        @Override
        public int getItemCount() {

            return 4;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, Memo.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, SpringNote.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, StudyPlanner.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 3) {
                    Intent i = new Intent( Good_Introduce.this, Postit.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }


    public class RecycleAdapter6 extends RecyclerView.Adapter<RecycleAdapter6.ViewHolder> {

        Context context;

        public RecycleAdapter6(Context context) {
            this.context = context;
        }

        public RecycleAdapter6(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter6.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter6.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_circularmirror);//????????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_cardmirror);//????????????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_mirrorbutton);//????????????
            }

        }

        @Override
        public int getItemCount() {

            return 3;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, CircularMirror.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, CardMirror.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, MirrorButton.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }

    public class RecycleAdapter7 extends RecyclerView.Adapter<RecycleAdapter7.ViewHolder> {

        Context context;

        public RecycleAdapter7(Context context) {
            this.context = context;
        }

        public RecycleAdapter7(PagerAdapter pagerAdapter) {
        }

        @Override
        public RecycleAdapter7.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

            final View view = LayoutInflater.from( getBaseContext() ).inflate( R.layout.item_list, parent, false );
            return new RecycleAdapter7.ViewHolder( view, context );
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if (position == 0) {
                holder.img.setImageResource(R.drawable.list_button_pinbutton);//?????????
            } else if (position == 1) {
                holder.img.setImageResource(R.drawable.list_button_blanket);//??????
            } else if (position == 2) {
                holder.img.setImageResource(R.drawable.list_button_fan);//??????
            } else if (position == 3) {
                holder.img.setImageResource(R.drawable.list_button_mousepad);//???????????????
            } else if (position == 4) {
                holder.img.setImageResource(R.drawable.list_button_phonecase);//????????????
            } else if (position == 5) {
                holder.img.setImageResource(R.drawable.list_button_tumbler);//?????????
            } else if (position == 6) {
                holder.img.setImageResource(R.drawable.list_button_mug);//?????????
            }
        }

        @Override
        public int getItemCount() {

            return 7;
        } //20???

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView img;
            Context context;

            public MainActivity activity;

            public ViewHolder(final View itemView, Context context) {
                super( itemView );
                this.context = context;
                itemView.setOnClickListener( this );
                img = (ImageView) itemView.findViewById( R.id.txt_vp_item_list );

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position == 0) {
                    Intent i = new Intent( Good_Introduce.this, PinButton.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 1) {
                    Intent i = new Intent( Good_Introduce.this, Blanket.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 2) {
                    Intent i = new Intent( Good_Introduce.this, Fan.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 3) {
                    Intent i = new Intent( Good_Introduce.this, MousePad.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 4) {
                    Intent i = new Intent( Good_Introduce.this, PhoneCase.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 5) {
                    Intent i = new Intent( Good_Introduce.this, Tumbler.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                } else if (position == 6) {
                    Intent i = new Intent( Good_Introduce.this, Mug.class );
                    startActivity( i );
                    finishActivity(R.layout.activity_good_introduce);
                }
            }
        }
    }
}