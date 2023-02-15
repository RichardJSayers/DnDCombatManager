package com.sayers.dndcombatmanager

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class AuditApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Create base DB
        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .name("auditcomply.realm")
            .schemaVersion(60)
            .allowWritesOnUiThread(true)
            .migration(Migration())
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }

    override fun onTerminate() {
        Realm.getDefaultInstance().close()
        super.onTerminate()
    }
}