package dev.shan.schoolms.util;

import java.sql.*;

public class CrudUtil {
	@SuppressWarnings("unchecked")
	public <T> T execute (final Connection connection, final String query, final Object ...binds) throws SQLException {
		final boolean isInsert = query.trim().matches("(?i)^insert\\s+into\\s+.*");
		final PreparedStatement preparedStatement = connection.prepareStatement(query, isInsert ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS);

		final int dataLength = binds.length;

		for (int a = 0; a < dataLength; a++) {
			final Object data = binds[a];

			if (data == null) {
				preparedStatement.setNull(a + 1, Types.NULL);
			} else {
				preparedStatement.setObject(a + 1, data);
			}
		}

		if (query.matches("(?i)^select.*")) return (T) preparedStatement.executeQuery();

		final int affectedRows = preparedStatement.executeUpdate();

		if (isInsert) {
			final ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

			if (generatedKeys.next()) return (T) (Integer) generatedKeys.getInt(1);
		}

		return (T) (Integer) affectedRows;
	}
}
