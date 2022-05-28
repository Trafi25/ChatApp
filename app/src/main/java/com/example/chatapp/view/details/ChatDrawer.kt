package com.example.chatapp.view.details

import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.example.chatapp.R
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

class ChatDrawer (val mainActivity: AppCompatActivity, val toolbar: Toolbar){
    private lateinit var navDrawer: Drawer
    private lateinit var navHeader: AccountHeader

    fun createDrawer(){
        createHeader()
        buildNavDrawer()
    }

    private fun buildNavDrawer() {
        navDrawer = DrawerBuilder().withActivity(mainActivity).withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withAccountHeader(navHeader).withSelectedItem(-1)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true).withName("Create group")
                    .withIcon(R.drawable.ic_baseline_group).withSelectable(false),
                PrimaryDrawerItem().withIdentifier(101)
                    .withIconTintingEnabled(true).withName("View Contacts")
                    .withIcon(R.drawable.ic_baseline_contacts_24).withSelectable(false),
                PrimaryDrawerItem().withIdentifier(102)
                    .withIconTintingEnabled(true).withName("Add person")
                    .withIcon(R.drawable.ic_baseline_person_add).withSelectable(false)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    return false
                }
            }).build()

    }

    private fun createHeader() {
        navHeader = AccountHeaderBuilder().withActivity(mainActivity)
            .addProfiles(
                ProfileDrawerItem().withName("User Name")
                    .withEmail("+380123456789")
            )
            .withHeaderBackground(R.drawable.header_background).build()
    }
}