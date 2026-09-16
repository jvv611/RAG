# StarMind (星识) - AI Knowledge Management System

StarMind is an enterprise-grade AI knowledge management system built with RAG (Retrieval-Augmented Generation) technology. It provides intelligent document processing and retrieval capabilities using a modern tech stack.

## Tech Stack

### Backend
- Java 17
- Spring Boot 3.x
- MySQL 8.0
- Elasticsearch 8.10.0
- Redis 7.0.11
- Kafka 3.2.1
- MinIO 8.5.12

### Frontend
- Vue 3
- TypeScript
- Vite
- Pinia
- Element Plus

### AI Services
- DeepSeek API (LLM)
- DashScope Embedding (Text-embedding-v4)

## Features

- 📄 **Document Processing**: Upload and parse multiple document formats
- 🔍 **Semantic Search**: Vector-based document retrieval with Elasticsearch
- 💬 **AI Chat**: RAG-powered conversational interface
- 👥 **Multi-tenant**: Organization-based data isolation
- 🔐 **Security**: JWT authentication and role-based access control
- ⚡ **Real-time**: WebSocket support for streaming responses

## Quick Start

### Prerequisites
- Java 17+
- Maven 3.8.6+
- Node.js 18.20.0+
- pnpm 8.7.0+
- Docker (for services)

### Start with Docker

```bash
# Start all services (MySQL, Elasticsearch, Redis, Kafka, MinIO)
cd docs && docker-compose up -d

# Run backend
mvn spring-boot:run

# Run frontend
cd frontend && pnpm install && pnpm dev
```

Visit http://localhost:5173 for the frontend application.

## Project Structure

```
StarMind/
├── src/                    # Backend source code
│   ├── main/java/         # Java application code
│   └── main/resources/    # Configuration files
├── frontend/              # Vue 3 frontend application
├── docs/                  # Documentation and Docker configs
├── scripts/               # Utility scripts
└── pom.xml               # Maven configuration
```

## Development

See [CLAUDE.md](CLAUDE.md) for detailed development guide.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Documentation

- [CLAUDE.md](CLAUDE.md) - Development guide for Claude Code
- [AGENTS.md](AGENTS.md) - AI agents documentation

---

Built with ❤️ using RAG technology
