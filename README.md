# Cache
This is my educational project, implementation of concurrent Cache. Project builds via Maven. Cache has a good concurrency and works between repository and DAO layers, which makes it possible to provide data via cache when it's up to date. When exceeding maximum size cahce automatically cleans.
This project is based on Strategy GOF pattern to correspond SOLID principles, especially open closed principle.
To use cache you should implement DAO, DataAccessStrategy and KeyExtractStrategy interfaces.
