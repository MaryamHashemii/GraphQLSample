package com.zarinpal.test.data.datasource.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.zarinpal.test.domain.models.SingleRepositoryModel;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SingleRepositoryModel> __insertionAdapterOfSingleRepositoryModel;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSingleRepositoryModel = new EntityInsertionAdapter<SingleRepositoryModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `repository` (`id`,`name`,`image`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SingleRepositoryModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
      }
    };
  }

  @Override
  public Object saveListRepositories(final List<SingleRepositoryModel> listTrivia,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSingleRepositoryModel.insert(listTrivia);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getListRepositories(final Continuation<? super List<SingleRepositoryModel>> p0) {
    final String _sql = "SELECT * FROM repository";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<SingleRepositoryModel>>() {
      @Override
      public List<SingleRepositoryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<SingleRepositoryModel> _result = new ArrayList<SingleRepositoryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SingleRepositoryModel _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            _item = new SingleRepositoryModel(_tmpId,_tmpName,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
