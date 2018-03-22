package com.yunti.media.util;

import android.content.Context;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

/**
 * A {@link DataSource.Factory} that produces {@link FileDecryptionDataSource}.
 * Created by kangqiang on 2017/7/20.
 */

public final class FileDecryptionDataSourceFactory implements DataSource.Factory {

    private final TransferListener<? super FileDecryptionDataSource> listener;
    private Context mContext;

    public FileDecryptionDataSourceFactory(Context context) {
        this(context, null);
    }

    public FileDecryptionDataSourceFactory(Context context, TransferListener<? super FileDecryptionDataSource> listener) {
        this.listener = listener;
        this.mContext = context;
    }

    @Override
    public DataSource createDataSource() {
        return new FileDecryptionDataSource(mContext,listener);
    }

}

