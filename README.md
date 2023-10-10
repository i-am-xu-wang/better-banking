# better-banking
Better banking application takes bank transaction information from a third-party api(better-banking.io) and enrich bank statements with more infomation that consumers would like to see.

This project is mainly in the purpose for studying Springboot with no access to real commercial bank information.

Specifically, the project has practiced following key concepts: 

- REST Controllers: Handling and Mapping Http requeset. Converting JSON objects into object specified class.
- Circuit breakers: Preventing casacading failures and provide fall back methods.
- WebClient: Handling web request and response in a non-block manner.
- Sprint Security: Secure endpoints and provide authorization in default form and OAuth2.
- Caching: Enable cache using redis server to avoid duplicate api calls.
