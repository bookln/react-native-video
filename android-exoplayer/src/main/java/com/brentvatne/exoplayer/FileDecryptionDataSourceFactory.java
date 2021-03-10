package com.brentvatne.exoplayer;

import android.content.Context;

import com.google.android.exoplayer2.upstream.DataSource;

public final class FileDecryptionDataSourceFactory implements DataSource.Factory {

    private Context mContext;

    public FileDecryptionDataSourceFactory(Context context) {
        mContext = context;
    }

    @Override
    public DataSource createDataSource() {
        return new FileDecryptionDataSource(this.mContext);
    }
}
